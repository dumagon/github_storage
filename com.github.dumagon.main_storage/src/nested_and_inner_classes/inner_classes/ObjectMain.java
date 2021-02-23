package nested_and_inner_classes.inner_classes;

class ContainerTwo {

    private int a;

    public class Box {

        ContainerTwo instance=new ContainerTwo();

        /// building a new object of the outer class ///

        public void changeA (int change){

            instance.a=change;

  // changing the field a of the new object , the original A remains its value (0) ////

            System.out.println(instance.a);

            // getting the value of the instance (67) ///
        }


    }


    public int getA() {
        return a;
    }

    }




public class ObjectMain {

    public static void main(String[] args) {



        ContainerTwo.Box insta =new ContainerTwo().new Box();
        insta.changeA(67);

        ContainerTwo insta2 =new ContainerTwo();

        System.out.println(insta.instance.getA());

   /// getting the value of the instance (67) ////

        System.out.println(insta2.getA());

  /////// getting the value of the instance (0)of the outer class


    }
}
