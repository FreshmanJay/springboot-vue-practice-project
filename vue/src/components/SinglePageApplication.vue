<template>
  <div class="page-wrapper">
      <!-- 查询条件 -->
       <div class="filter-wrapper">
          <el-input v-model="search" class="search_name" size="mini" placeholder="输入姓名查询"></el-input>
          <el-button type="primary" @click="searchData()" class="el-icon-search">查询</el-button>
          <el-button class="el-icon-refresh" type="primary" @click="refreshPageData">刷新</el-button>
          <el-button class="el-icon-circle-plus-outline" type="primary" @click="dialogVisible = true">新增</el-button>
       </div>

      <div class="content-wrapper">
        <div class="content-table">
          <el-table
            :data="tableData"
            border
            style="width: 100%"
            class="data-table"
          >
          <el-table-column label="用户名" align="center">
              <template slot-scope="scope">
                <el-popover trigger="hover" placement="right">
                  <p>姓名: {{ scope.row.userName }}</p>
                  <p>部门Id: {{ scope.row.deptId }}</p>
                  <p>用户类型: {{ scope.row.userType }}</p>
                  <div slot="reference" class="name-wrapper">
                    <el-button type="text">{{ scope.row.userName }}</el-button>
                  </div>
                </el-popover>
              </template>
            </el-table-column>

            <el-table-column label="工号" align="center">
              <template slot-scope="scope">
                <span>{{ scope.row.userId }}</span>
              </template>
            </el-table-column>

            <el-table-column label="用户类型" align="center">
              <template slot-scope="scope">
                <i class="el-icon-s-custom hidden-sm-and-down"></i>
                <span>{{ scope.row.userType }}</span>
              </template>
            </el-table-column>

            <el-table-column label="部门Id" align="center">
              <template slot-scope="scope">
                <span>{{ scope.row.deptId }}</span>
              </template>
            </el-table-column>

            <el-table-column label="交易员Id" align="center">
              <template slot-scope="scope">
                <span>{{ scope.row.traderId }}</span>
              </template>
            </el-table-column>

            <el-table-column label="交易员名称" align="center">
              <template slot-scope="scope">
                <span>{{ scope.row.traderName }}</span>
              </template>
            </el-table-column>

            <el-table-column
              label="操作"
              width="200"
              align="center"
            >
              <template slot-scope="scope">
                <el-button type="text" size="mini" icon="el-icon-edit" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                <el-button class="del-button" size="mini" type="text" icon="el-icon-delete" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
              </template>
            </el-table-column>
          </el-table>
        </div>


        <div class="content-dialog">
          <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="90px" class="demo-ruleForm" size="medium">
            <el-dialog
              title="新增"
              :append-to-body='true'
              :visible.sync="dialogVisible"
              width="35%"
              :before-close="handleAddClose"
            >
              <el-input type="hidden" v-model="ruleForm.userId"/>

              <el-form-item label="用户名" prop="userName">
                <el-input v-model="ruleForm.userName"></el-input>
              </el-form-item>

              <el-form-item label="用户类型" prop="userType">
                <el-input v-model="ruleForm.userType"></el-input>
              </el-form-item>

              <el-form-item label="部门Id" prop="deptId">
                <el-input v-model="ruleForm.deptId"></el-input>
              </el-form-item>

              <el-form-item label="交易员Id" prop="traderId">
                <el-input v-model="ruleForm.traderId"></el-input>
              </el-form-item>

              <el-form-item label="交易员名称" prop="traderName">
                <el-input v-model="ruleForm.traderName"></el-input>
              </el-form-item>

              <span slot="footer" class="dialog-footer">
                <el-button @click="cancel()" size="medium">取 消</el-button>
                <el-button @click="addUser()" type="primary" size="medium">确 定</el-button>
              </span>
            </el-dialog>
          </el-form>

          <el-form :model="ruleForm" :rules="rules" ref="ruleFormEdit" label-width="90px" class="demo-ruleForm" size="medium">
            <el-dialog
              title="编辑"
              :append-to-body='true'
              :visible.sync="dialogUpdate"
              width="35%"
              :before-close="handleClose"
            >
              <el-input type="hidden" v-model="ruleForm.userId"/>

              <el-form-item label="用户名" prop="userName">
                <el-input v-model="ruleForm.userName"></el-input>
              </el-form-item>

              <el-form-item label="用户类型" prop="userType">
                <el-input v-model="ruleForm.userType"></el-input>
              </el-form-item>

              <el-form-item label="部门Id" prop="deptId">
                <el-input v-model="ruleForm.deptId"></el-input>
              </el-form-item>

              <el-form-item label="交易员Id" prop="traderId">
                <el-input v-model="ruleForm.traderId"></el-input>
              </el-form-item>

              <el-form-item label="交易员名称" prop="traderName">
                <el-input v-model="ruleForm.traderName"></el-input>
              </el-form-item>

              <span slot="footer" class="dialog-footer">
                  <el-button @click="cancel()" size="medium">取 消</el-button>
                  <el-button @click="updateUser()" type="primary" size="medium">确 定</el-button>
                </span>
            </el-dialog>
          </el-form>
        </div>

      </div>

      <!-- 分页 -->
      <div class="pagination-wrapper">
        <el-pagination
          background
          :current-page.sync="pager.currentPage"
          small
          layout="total, sizes, prev, pager, next, jumper"
          :page-size="pager.pageSize"
          :total="pager.total"
          @current-change="handleCurrentChange"
          @size-change="handleSizeChange"
        >
        </el-pagination>
      </div>
  </div>
</template>

<script>
    export default {
        data() {
            return {
                ruleForm: {
                    userId: '',
                    userName: '',
                    userType: '',
                    deptId: '',
                    traderId: '',
                    traderName: ''
                },
                rules: {
                    userName: [
                        { required: true, message: '请输入姓名', trigger: 'blur' },
                        { min: 2, max: 7, message: '长度在 2 到 7 个字符', trigger: 'blur' }
                    ],
                    deptId: [
                        { required: true, message: '请输入部门Id', trigger: 'blur' },
                        { min: 5, message: '长度大于 5 个字符', trigger: 'blur' }
                    ],
                },
                tableData: [],
                search: '',
                dialogVisible: false,
                dialogUpdate: false,
                pager: {
                  pageSize: 20,
                  currentPage: 1,
                  total: 0,
                }
            }
        },
        methods: {
            handleEdit(index, row) {
                this.dialogUpdate = true;
                this.ruleForm = Object.assign({}, row); //这句是关键！！！
            },
            handleDelete(index, row) {
                this.$confirm('是否删除操作, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    const postData = this.qs.stringify({
                        userId: row.userId,
                    });

                    this.axios({
                        method: 'post',
                        url:'/delete',
                        data:postData
                    }).then(response =>{
                        this.pager.currentPage = 1;
                        this.searchData();
                        this.$message({
                            type: 'success',
                            message: '删除用户信息成功!'
                        });
                    }).catch(error =>{
                        console.log(error);
                    });
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消删除'
                    });
                });
            },
            handleAddClose(){
              this.dialogVisible = false;
            },
            handleClose() {
              this.dialogUpdate = false;
            },
            handleCurrentChange(currentPage) {
              this.pager.currentPage = currentPage;
              this.searchData();
            },
            handleSizeChange(pageSize){
              this.pager.pageSize = pageSize;
              this.searchData();
            },
            cancel() {
                this.dialogUpdate = false;
                this.dialogVisible = false;
                this.cleanUserData();
            },
            cleanUserData(){
                this.ruleForm = {
                    userName: '',
                    userType: '',
                    deptId: '',
                    traderId: '',
                    traderName: ''
                }
            },
            addUser() {
              this.$refs['ruleForm'].validate((valid) => {
                if (valid) {
                  const postData = this.qs.stringify({
                      userType: this.ruleForm.userType,
                      userName: this.ruleForm.userName,
                      deptId: this.ruleForm.deptId,
                      traderId: this.ruleForm.traderId,
                      traderName: this.ruleForm.traderName
                  });

                  this.axios({
                      method: 'post',
                      url:'/insert',
                      data:postData
                  }).then(response =>{
                      this.$message({
                        type: 'success',
                        message: '新增用户信息成功!'
                      })
                      this.searchData();
                      this.dialogVisible = false
                  }).catch(error =>{
                      console.log(error);
                  });
                } else {
                  console.log('error submit!!');
                  return false;
                }
              });
            },
            updateUser() {
                const postData = this.qs.stringify({
                    userId: this.ruleForm.userId,
                    userType: this.ruleForm.userType,
                    userName: this.ruleForm.userName,
                    deptId: this.ruleForm.deptId,
                    traderId: this.ruleForm.traderId,
                    traderName: this.ruleForm.traderName
                });

                this.axios({
                    method: 'post',
                    url:'/update',
                    data:postData
                }).then(response =>{
                    this.pager.currentPage = 1;
                    this.$message({
                        type: 'success',
                        message: '更新用户信息成功!'
                    });
                    this.dialogUpdate = false;
                    this.cleanUserData();
                    this.searchData();
                }).catch(error =>{
                    this.$message({
                        type: 'success',
                        message: '更新用户信息失败!'
                    });
                    console.log(error);
                });
            },
            searchData() {
                const postData = {
                    userName: this.search,
                    currentPage: this.pager.currentPage,
                    pageSize: this.pager.pageSize
                };

                this.axios({
                    method: 'post',
                    url: '/ListByName',
                    data: postData
                }).then(response =>{
                    this.tableData = response.data.data || [];
                    this.pager.total = response.data.total || 0;
                }).catch(error =>{
                    console.log(error);
                });
            },
            refreshPageData() {
                this.search = '';
                this.pager.currentPage = 1;
                this.pager.pageSize = 20;
                this.searchData();
            }
        },
        created() {
          this.searchData();
        }
    }
</script>

<style>
  .page-wrapper {
    height: 100%;
    display: flex;
    flex-direction: column;
    padding: 0px 12px;
  }
  .filter-wrapper {
    display: flex;
    align-items: center;
    gap: 8px;
    flex: 0;
    margin: 8px 0;
  }
  .content-wrapper {
    flex: 1;
    display: flex;
    flex-direction: column;
  }
  .content-table {
    flex: 1;
    display: flex;
    flex-direction: column;
  }
  .el-table {
    flex: 1;
  }
  .content-dialog {
    flex: 0;
  }
  .pagination-wrapper {
    flex: 0;
    display: flex;
    align-items: center;
    justify-content: end;
  }
  .search_name{
    width: 200px;
  }
  .pages{
    margin: 0px;
    padding: 0px;
    text-align: right;
  }
  .el-button {
    height: 28px;
    padding: 0 8px;
    margin-left: 0;
    border: 0;
  }
  .el-table {
    background-color: #222222;
    border-radius: 2px;
  }
  .el-table--border {
    border: 1px solid rgba(136, 141, 152, 1);
  }
  .el-table--border::after {
    background-color: #222222;
  }
  .el-table::before {
    background-color: #222222;
  }
  .el-table div.el-table__fixed-right::before {
    display: none;
  }
  .el-table .el-table__cell {
    padding: 0;
  }
  .el-table  .cell {
    line-height: 32px;
  }

  .el-table  td {
    line-height: 32px;
    height: 32px;
    background-color: #222222;
    color: #fff;
  }
  .el-button--primary {
    background-color: rgba(31, 128, 255, 0.4);
  }
  .el-button--primary:hover {
    color: #fff;
    background-color: rgba(31, 128, 255, 0.8);
    border-color: transparent;
  }
  .el-pagination {
    min-height: 40px;
    display: flex;
    gap: 4px;
    align-items: center;
  }
  .el-button.del-button {
    color: #F56C6C;
  }
  .data-table .el-table__body tr:hover > td {
    background-color: #141414 !important;
  }
  .el-table th.el-table__cell {
    height: 32px;
    background-color: #141414;
    color: #fff;
  }
  .el-button+.el-button{
    margin-left: 0;
  }
  .el-table--border .el-table__cell {
    border-right: 1px solid rgba(136, 141, 152, 1);
  }
  .el-table th.el-table__cell.is-leaf {
    border-bottom: 1px solid rgba(136, 141, 152, 1);
    color: rgb(215, 220, 226);
  }
  .el-table td.el-table__cell {
    border-bottom: 1px solid rgba(136, 141, 152, 1);
    color: rgb(188, 194, 201);
  }
</style>