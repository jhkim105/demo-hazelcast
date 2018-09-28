https://dzone.com/articles/jpa-caching-with-hazelcast-hibernate-and-spring-bo

docker run -d --name hazelcast -p 5701:5701 hazelcast/hazelcast

docker run -d --name hazelcast-mgmt -p 38080:8080 hazelcast/management-center:latest


hazelcast.xml(/opt/hazelcast)
```
<hazelcast
   	xmlns="http://www.hazelcast.com/schema/config"
   	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.hazelcast.com/schema/config http://www.hazelcast.com/schema/config/hazelcast-config-3.8.xsd">
   	<group>
   		<name>dev</name>
   		<password>dev-pass</password>
   	</group>
   	<management-center enabled="true" update-interval="3">http://192.168.99.100:38080/mancenter</management-center>
   ...
</hazelcast>$xslt
```

Hazelcast Dashboard: http://192.168.99.100:38080/mancenter

