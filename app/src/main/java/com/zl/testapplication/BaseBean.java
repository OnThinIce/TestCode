package com.zl.testapplication;

import java.util.List;

public class BaseBean {

    /**
     * errcode : 0
     * errmsg : 成功
     * data : {"AllCount":1,"PageSize":10,"List":[{"name":"为","birthday":"2012-03-03 00:00:00","id":15,"studentCode":"20","hobbies":"高考题23","age":34}]}
     */

    private String errcode;
    private String errmsg;
    private DataBean data;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * AllCount : 1
         * PageSize : 10
         * List : [{"name":"为","birthday":"2012-03-03 00:00:00","id":15,"studentCode":"20","hobbies":"高考题23","age":34}]
         */

        private int AllCount;
        private int PageSize;
        private java.util.List<ListBean> List;

        public int getAllCount() {
            return AllCount;
        }

        public void setAllCount(int AllCount) {
            this.AllCount = AllCount;
        }

        public int getPageSize() {
            return PageSize;
        }

        public void setPageSize(int PageSize) {
            this.PageSize = PageSize;
        }

        public List<ListBean> getList() {
            return List;
        }

        public void setList(List<ListBean> List) {
            this.List = List;
        }

        public static class ListBean {
            /**
             * name : 为
             * birthday : 2012-03-03 00:00:00
             * id : 15
             * studentCode : 20
             * hobbies : 高考题23
             * age : 34
             */

            private String name;
            private String birthday;
            private int id;
            private String studentCode;
            private String hobbies;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getStudentCode() {
                return studentCode;
            }

            public void setStudentCode(String studentCode) {
                this.studentCode = studentCode;
            }

            public String getHobbies() {
                return hobbies;
            }

            public void setHobbies(String hobbies) {
                this.hobbies = hobbies;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
    }
}
