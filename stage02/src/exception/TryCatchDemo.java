package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("begin");
        String str = "";
        try {
            System.out.println(str.charAt(0));
/*
        } catch (NullPointerException e) {
            System.out.println("NullPointerException-----");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("NullPointerException | StringIndexOutOfBoundsException");
*/
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }


        System.out.println("end");
    }
}