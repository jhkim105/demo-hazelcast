https://dzone.com/articles/jpa-caching-with-hazelcast-hibernate-and-spring-bo

docker run -d --name hazelcast -p 5701:5701 hazelcast/hazelcast

docker run -d --name hazelcast-mgmt -p 38080:8080 hazelcast/management-center:latest


hazelcast.xml(/opt/hazelcast)
```
<?xml version="1.0" encoding="UTF-8"?>
<hazelcast xmlns="http://www.hazelcast.com/schema/config"
           xsi:schemaLocation="http://www.hazelcast.com/schema/config
http://www.hazelcast.com/schema/config/hazelcast-config-3.11.xsd"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

  <group>
    <name>dev</name>
    <password>dev-pass</password>
  </group>
  <management-center enabled="true" update-interval="3">http://172.25.111.191:38080/hazelcast-mancenter</management-center>    
</hazelcast>
```

Hazelcast Management Center: http://localhost:38080/hazelcast-mancenter/

