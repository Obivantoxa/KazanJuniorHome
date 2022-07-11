package lesson9;


public abstract class PrintPub {
    private String name;
    private int year;
    private int kolList;
    private String pub;

    public PrintPub(String name, int year, String pub, int kolList) {
        this.name = name;
        this.year = year;
        this.pub = pub;
        this.kolList = kolList;
    }

    public PrintPub() {
    }

    public int getKolList() {
        return kolList;
    }

    public void setKolList(int kolList) {
        this.kolList = kolList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintPub printPub = (PrintPub) o;

        if (year != printPub.year) return false;
        if (kolList != printPub.kolList) return false;
        if (name != null ? !name.equals(printPub.name) : printPub.name != null) return false;
        return pub != null ? pub.equals(printPub.pub) : printPub.pub == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + kolList;
        result = 31 * result + (pub != null ? pub.hashCode() : 0);
        return result;
    }

    @Override
    public abstract String toString();
//
//    public static void printMaxBook(PrintPub pub[]){
//        Book b = null;
//        for(PrintPub pub : p){
//            if(pub instanceof Book)
//                if( b == null){
//                    b = (Book) pub;
//                }else if(b.getKolList()< ((Book) pub).getKolList()){
//                    b = (Book) pub;
//                }
//        }
//    }

    public static PrintPub[] sortBookAsc(PrintPub p[]) {
        for (int i = 0; i < p.length - 1; i++) {
            if (p[i] instanceof Book) {
                for (int j = 1; j < p.length - i; j++) {
                    if (p[j] instanceof Book) {
                        if (((Book) p[i]).getKolList() < ((Book) p[j]).getKolList()) {

                            int l = ((Book) p[j]).getKolList();

                            ((Book) p[j]).setKolList(((Book) p[i]).getKolList());
                            ((Book) p[i]).setKolList(l);
                        }
                    }
                }
            }

        }
        return p;
    }

    public static PrintPub[] sortBookDesc(PrintPub p[]) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 1 + i; j < p.length; j++) {
                if (p[i].getKolList() > p[j].getKolList()) {
                    int l = p[j].getKolList();
                    int t = p[i].getKolList();
                    p[i].setKolList(l); // замена переменных
                    p[j].setKolList(t);
                }
            }
        }
        return p;
    }


}
