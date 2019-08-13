package chapter03.conditional;

public class WindowsListService implements ListService {
    public WindowsListService() {
        System.out.println("This is WindowsListService constructor");
    }

    @Override
    public String showListCmd() {
        return "dir";
    }
}
