
# 环境搭建

## MySQL搭建

* 新建文件夹用于保存持久化文件，如不设置每次`docker`重启数据都会丢失

* 使用`docker`启动`MySQL`，命令如下
		
    `docker run -d -e MYSQL_ROOT_PASSWORD=password --name mysqldocker -v 持久化路径:/var/lib/mysql -p 3306:3306 mysql`
     
* 如果是MySQL 8.0以上，需要改一下用户密码加密算法，不然会低版本客户端无法连接。步骤如下

    + 进入docker进程。`Docker exec -it mysqldocker bash`
    
    + 连接MySQL。`Mysql -uroot -ppassword`
    
    + 修改root用户密码加密算法。
    
        `ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '你的新密码'；`
        `FLUSH PRIVILEGES; `
       
		
## PhpMyAdmin搭建

* `docker run --name myadmin -d --link mysql容器别名:db -p 8080:80 phpmyadmin/phpmyadmin`

## Redis搭建

* `docker run --name myredis -v 持久化路径:/data -d -p 6379:6379 redis redis-server --appendonly yes --requirepass "admin"`