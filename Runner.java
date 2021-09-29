package exceptions;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        check(1);
        check(2);
        check(3);
        check(4);
        check(5);

    }
    public static void check(int number){
        try{
            switch (number){
                case 1:
                    throw new ExceptionA("number shouldn't be 1!");
                case 2:
                    throw new ExceptionB("number shouldn't be 2!");
                case 3:
                    throw new NullPointerException();
                case 4:
                    throw new IOException();
                default:
                    System.out.println("everything's ok!");
            }
        }catch (ExceptionB e){
            e.printStackTrace();
        }catch (ExceptionA e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
