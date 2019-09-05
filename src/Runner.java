public class Runner extends Thread {

    Thread runner1 = new Thread();
    Thread runner2 = new Thread();
    Thread runner3 = new Thread();
    Thread runner4 = new Thread();
    Thread runner5 = new Thread();

    @Override
    public void run() {
        try {
            runner1.setName("Runner 1 ");
            runner2.setName("Runner 2 ");
            runner3.setName("Runner 3 ");
            runner4.setName("Runner 4 ");
            runner5.setName("Runner 5 ");


            System.out.println(runner1.getName() + "берет палочку");
            System.out.println(runner1.getName() + "бежит к " + runner2.getName());
            runner1.start();
            runner1.sleep(5000);




            System.out.println(runner2.getName() + "берет палочку");
            System.out.println(runner2.getName() + "бежит к " + runner3.getName());
            runner2.join();
            runner2.start();
            runner2.sleep(5000);



            System.out.println(runner3.getName() + "берет палочку");
            System.out.println(runner3.getName() + "бежит к " + runner4.getName());
            runner3.join();
            runner3.start();
            runner3.sleep(5000);



            System.out.println(runner4.getName() + "берет палочку");
            System.out.println(runner4.getName() + "бежит к " + runner5.getName());
            runner4.join();
            runner4.start();
            runner4.sleep(5000);


            System.out.println(runner5.getName() + "берет палочку");
            System.out.println(runner5.getName() + "бежит к финишу" );
            runner5.join();
            runner5.start();
            runner5.sleep(5000);


            runner5.join();
            runner4.run();
            System.out.println(runner5.getName() + "бежит к " + runner4.getName() );
            runner4.sleep(5000);

            System.out.println(runner3.getName() + "берет палочку");
            System.out.println(runner3.getName() + "бежит к " + runner2.getName());
            runner4.join();
            runner3.run();
            runner3.sleep(5000);

            System.out.println(runner2.getName() + "берет палочку");
            System.out.println(runner2.getName() + "бежит к " + runner1.getName());
            runner2.join();
            runner2.run();
            runner2.sleep(5000);

            System.out.println(runner1.getName() + "берет палочку");
            runner1.join();
            runner1.run();
            runner1.sleep(5000);




        }catch (Exception e){

        }

    }
}
