����   4 >  ReadWriteUsingCharacterBased  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LReadWriteUsingCharacterBased; main ([Ljava/lang/String;)V  java/io/File  b.txt
     (Ljava/lang/String;)V
     exists ()Z
     createNewFile  This is character based writer ! java/io/FileWriter
   #  $ (Ljava/io/File;)V
   & '  write
   ) *  close
 , . - java/lang/Exception /  printStackTrace args [Ljava/lang/String; f Ljava/io/File; s Ljava/lang/String; fw Ljava/io/FileWriter; e Ljava/lang/Exception; StackMapTable 1