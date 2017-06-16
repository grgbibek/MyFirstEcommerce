<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING/UTD BEAN 2.O//EN" "http://www/springframework.org/dtd/spring-beans-2.0.dtd">

<beans>
	<bean id="triangle" class="com.info.grgbibek.Triangle">
		<!-- <constructor-arg type="java.lang.String" value="Triangle" />
		<constructor-arg type="int" value="3" />
		 -->
		 
		<!-- <constructor-arg index="0" value="Triangle" />
		<constructor-arg index="1" value="3" />
		 -->
		 <!--
		  we can refer to the ids or name...We can choose to restrict  refer to id only or to the name only. 
		 Example:
		 <property name="PointA">
		 	<idref="zeroPoint"/>
		 </property>
		 -->
		 
		 <property name="PointA" ref="zeroPoint"/>
		 
		 
		 <property name="PointB">
		 	<bean id="Point1" class="com.info.grgbibek.Point">
				<property name="x" value="0"/>
				<property name="y" value="20"/>
			</bean>
		 <