����   4 Q  	SliderTut  javax/swing/JFrame panel Ljavax/swing/JPanel; slider Ljavax/swing/JSlider; <init> ()V Code
   	 

     
setVisible (Z)V
     setSize (II)V
     setDefaultCloseOperation (I)V  javax/swing/JPanel
  	       javax/swing/JSlider
  " 	 # (IIII)V	  %  
  ' (  setPaintTicks
  * +  setMajorTickSpacing
  - .  setMinorTickSpacing
  0 1  setPaintLabels
  3 4 5 add *(Ljava/awt/Component;)Ljava/awt/Component;
  7 8 9 getContentPane ()Ljava/awt/Container;
 ; 3 < java/awt/Container LineNumberTable LocalVariableTable this LSliderTut; main ([Ljava/lang/String;)V D SliderTut$1
 C 
 G I H java/awt/EventQueue J K invokeLater (Ljava/lang/Runnable;)V args [Ljava/lang/String; 
SourceFile SliderTut.java InnerClasses !                    	 
     � 