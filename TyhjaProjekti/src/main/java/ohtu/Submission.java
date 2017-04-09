package ohtu;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Submission {

    private String student_number;
    private String week;
    private int hours, nullit;
    private Object a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16,
            a17, a18, a19, a20, a21;
    private ArrayList<String> tehdyt = new ArrayList();

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        this.doIt();
        String s = "Viikko " + this.week + ": tehtyjä tehtäviä yhteensä: "
                + this.tehdyt.size() + ", aikaa kului " + this.hours + " tuntia, tehdyt tehtävät: ";
        for (String str : this.tehdyt) {
            s += str + " ";
        }
        return s;
    }

    public void doIt() {
        if (this.a1 == null) {
            this.nullit++;
        } else if ((boolean) this.a1 == true) {
            this.tehdyt.add("1");
        }

        if (this.a2 == null) {
            this.nullit++;
        } else if ((boolean) this.a2 == true) {
            this.tehdyt.add("2");
        }

        if (this.a3 == null) {
            this.nullit++;
        } else if ((boolean) this.a3 == true) {
            this.tehdyt.add("3");
        }

        if (this.a4 == null) {
            this.nullit++;
        } else if ((boolean) this.a4 == true) {
            this.tehdyt.add("4");
        }

        if (this.a5 == null) {
            this.nullit++;
        } else if ((boolean) this.a5 == true) {
            this.tehdyt.add("5");
        }

        if (this.a6 == null) {
            this.nullit++;
        } else if ((boolean) this.a6 == true) {
            this.tehdyt.add("6");
        }

        if (this.a7 == null) {
            this.nullit++;
        } else if ((boolean) this.a7 == true) {
            this.tehdyt.add("7");
        }

        if (this.a8 == null) {
            this.nullit++;
        } else if ((boolean) this.a8 == true) {
            this.tehdyt.add("8");
        }

        if (this.a9 == null) {
            this.nullit++;
        } else if ((boolean) this.a9 == true) {
            this.tehdyt.add("9");
        }

        if (this.a10 == null) {
            this.nullit++;
        } else if ((boolean) this.a10 == true) {
            this.tehdyt.add("10");
        }

        if (this.a11 == null) {
            this.nullit++;
        } else if ((boolean) this.a11 == true) {
            this.tehdyt.add("11");
        }

        if (this.a12 == null) {
            this.nullit++;
        } else if ((boolean) this.a12 == true) {
            this.tehdyt.add("12");
        }

        if (this.a13 == null) {
            this.nullit++;
        } else if ((boolean) this.a13 == true) {
            this.tehdyt.add("13");
        }

        if (this.a14 == null) {
            this.nullit++;
        } else if ((boolean) this.a14 == true) {
            this.tehdyt.add("14");
        }

        if (this.a15 == null) {
            this.nullit++;
        } else if ((boolean) this.a15 == true) {
            this.tehdyt.add("15");
        }

        if (this.a16 == null) {
            this.nullit++;
        } else if ((boolean) this.a16 == true) {
            this.tehdyt.add("16");
        }

        if (this.a17 == null) {
            this.nullit++;
        } else if ((boolean) this.a17 == true) {
            this.tehdyt.add("17");
        }

        if (this.a18 == null) {
            this.nullit++;
        } else if ((boolean) this.a18 == true) {
            this.tehdyt.add("18");
        }

        if (this.a19 == null) {
            this.nullit++;
        } else if ((boolean) this.a19 == true) {
            this.tehdyt.add("19");
        }

        if (this.a20 == null) {
            this.nullit++;
        } else if ((boolean) this.a20 == true) {
            this.tehdyt.add("20");
        }

        if (this.a21 == null) {
            this.nullit++;
        } else if ((boolean) this.a21 == true) {
            this.tehdyt.add("21");
        }
    }

}
