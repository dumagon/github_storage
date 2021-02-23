package nested_and_inner_classes.inner_classes;


class ContainerOf {

   private static int field =0;

    public class ContainedIn {

        public void showMe (int e){
            field=e;
 // Inner classes can see and change  private fields of the outer !!!!! ///////

            System.out.println("hi from the contained and plus "+field);

         //   field=0;
        }

        public int showMeToo (){
            return field;
        }
        
       
    }
    
    public int showMeToo1 (){
        return field;
    }
    



}

public class PrivateMain {
    public static void main(String[] args) {
        ContainerOf.ContainedIn instance=new ContainerOf().new ContainedIn();
        ContainerOf instance1=new ContainerOf();
        
        

        instance.showMe(44);
        System.out.println(instance.showMeToo());
        System.out.println(instance1.showMeToo1());
        
        
        
    }

}
