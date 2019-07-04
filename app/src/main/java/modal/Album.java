package modal;

public class Album {
    private String name;
    private int serial_no;



    public Album(String name, int serial_no) {
        this.name = name;
        this.serial_no = serial_no;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }
}
