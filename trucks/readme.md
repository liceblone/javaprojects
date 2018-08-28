// maven conf settings.xml
<server>
        <id>TomcatServer</id>
        <username>tomcat</username>
        <password>s3cret</password>
</server>


// tomcat conf  tomcat-uses.xml
 <role rolename="manager"/>
 <role rolename="manager-gui" />
 <role rolename="manager-script" />
 <role rolename="admin-gui" />
 <role rolename="admin-script" />
 <role rolename="admin" 

<user username="tomcat" password="s3cret" roles="manager-gui,manager-script,admin-gui,admin-script,manager,admin"/>



//tomcat conf web.xml
<init-param>
        <param-name>readonly</param-name>
        <param-value>false</param-value>
</init-param>
