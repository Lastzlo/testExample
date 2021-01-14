package version1;

public class HomeController {
    private void addHome(Home h){
        Home home = h;
    }

    private void updateHome(Home newHome){
        Home home = new Home ();

        if(newHome.equals (home)){
            System.out.println ("newHome.equals (home) = "+newHome.equals (home));
        } else {
            System.out.println ("newHome.equals (home) = "+newHome.equals (home));
        }

    }

}
