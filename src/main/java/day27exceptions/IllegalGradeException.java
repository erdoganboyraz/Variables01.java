package day27exceptions;
//Eger Exception Class`a extends ederseniz sizin class`iniz "Compile Time Exception" olur.
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }
}
