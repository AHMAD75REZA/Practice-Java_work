
 class Laptop {
        int monitorsize;
        String color;
        String processor;
        int ram;
        int hardDisk;

        void turnOn(){
        System.out.println("Laptop switched On now");
        }
        void turnOff(){
            System.out.println("Laptop switched Off now");
        }
        void idl(){
            System.out.println("Laptop is in idle mode  now");
        }
        void running(){
            System.out.println("Laptop is currently running mode now");
        }

        public static void main(String [] args) 
        {
        Laptop ibm = new Laptop();
        ibm.monitorsize = 14;
        ibm.color = "Black";
        ibm.processor  = "core2";
        ibm.ram = 32;
        ibm.hardDisk = 500; 


        ibm.turnOn();

        ibm.running();

        ibm.idl();

        ibm.turnOff();
        }
    }