����   C o
      java/lang/Object <init> ()V	  	 
   RelatorioPDF$Builder titulo Ljava/lang/String;	  	  RelatorioPDF	     autor	  	     conteudo	  	     rodape	    java/lang/StringBuilder
     === 
  " # $ append -(Ljava/lang/String;)Ljava/lang/StringBuilder; &  ===
 ( Autor:  * 
 , 
---

  . / 0 toString ()Ljava/lang/String;
   3 Relatório de Vendas - Maio
  5 6 7 	comTitulo *(Ljava/lang/String;)LRelatorioPDF$Builder; 9 ALICE TESTE
  ; < 7 comAutor > =As vendas do mês de maio cresceram 18% em relação a abril.
  @ A 7 comConteudo C Confidencial - Uso interno
  E F 7 	comRodape
  H I J build ()LRelatorioPDF;	 L M N O P java/lang/System out Ljava/io/PrintStream;
  R S 0 gerar
 U V W X Y java/io/PrintStream println (Ljava/lang/String;)V (LRelatorioPDF$Builder;)V Code LineNumberTable LocalVariableTable this LRelatorioPDF; builder LRelatorioPDF$Builder; sb Ljava/lang/StringBuilder; StackMapTable main ([Ljava/lang/String;)V args [Ljava/lang/String; 	relatorio 
SourceFile RelatorioPDF.java NestMembers InnerClasses Builder !                             Z  [   m     %*� *+� � *+� � *+� � *+� � �    \       
         $  ]       % ^ _     % ` a   S 0  [   �     u� Y� L*� � +� !*� � !%� !W*� � +'� !*� � !)� !W*� � +)� !*� � !)� !W*� � ++� !*� � !)� !W+� -�    \          "  <  V  p  ]       u ^ _    m b c  d    � "  	 e f  [   z     *� Y� 12� 48� :=� ?B� D� GL� K+� Q� T�    \   "    : 	 ;  <  =  >  ?  A ) B ]       * g h     i _   j    k l      m   
    n 	