����   4 D  FileReaderCharacterBased  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LFileReaderCharacterBased; main ([Ljava/lang/String;)V  java/io/File  b.txt
     (Ljava/lang/String;)V  java/io/FileReader
     (Ljava/io/File;)V  java/io/BufferedReader
      (Ljava/io/Reader;)V
  " # $ readLine ()Ljava/lang/String;	 & ( ' java/lang/System ) * out Ljava/io/PrintStream;
 , . - java/io/PrintStream /  println
 1 3 2 java/lang/Exception 4  printStackTrace args [Ljava/lang/String; f Ljava/io/File; fw Ljava/io/FileReader; br Ljava/io/BufferedReader; s Ljava/lang/String; e Ljava/lang/Exception; StackMapTable 
SourceFile FileReaderCharacterBased.java !               /     *� �    
                    	       �     3� Y� L� Y+� M� Y,� N-� !:� %� +� L+� 0�    * - 1  
   "    	 
      "  *  . 