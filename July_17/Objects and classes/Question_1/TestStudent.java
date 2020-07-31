public class TestStudent{

     public static void main(final String[] args) {
         // Test 1
         // Check setNames sets name and and getFullName returns name.
         System.out.println("Test 1");
         Student student = new Student();
         student.setNames("Patricia", "Nombuyiselo", "Noah");
         if (student.getFullName().equals("Patricia N. Noah")) {
             System.out.println("Pass");
         }
         else {
             System.out.println("Fail");
         }

         // Test 2
         // Check getFullName returns name, and DOES NOT change the Student object.
         System.out.println("Test 2");
         student = new Student();
         student.setNames("Nomalizo", "Frances", "Noah");
         if (student.getFullName().equals(student.getFullName())) {
             System.out.println("Pass");
         }
         else {
             System.out.println("Fail");
         }

     }

     static class Student {

         private String firstName;
         private String middleName;
         private String lastName;

         public void setNames(String firstName, String middleName,String lastName) {
             this.firstName = firstName;
             this.middleName = middleName;
             this.lastName = lastName;
         }

         public String getFullName() {

             String fullname = new String();
             fullname += this.firstName;
             fullname +=  " " + this.middleName.charAt(0) + ". ";
             fullname += this.lastName;
             return fullname;
         }
     }

 }
