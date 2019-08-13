package chapter03.conditional;

public class LinuxListService implements ListService {
    public LinuxListService() {
        System.out.println("This is LinuxListService constructor");
    }

    @Override
    public String showListCmd() {
        return "ls";
    }
}
