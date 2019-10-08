package first_task;

import java.io.Serializable;

public class Student implements Serializable {
    private String surnameNL;
    private int group;
    private int[] performance;

    public Student()
    {
        surnameNL = "";
        group = 0;
        performance = new int[]{0,0,0,0,0};
    }

    public Student(String surnameNL, int group, int[] performance) {
        this.surnameNL = surnameNL;
        this.group = group;
        this.performance = performance;
    }

    public String getSurnameNL() {
        return surnameNL;
    }

    public void setSurnameNL(String surnameNL) {
        this.surnameNL = surnameNL;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }

    public boolean isExcellent()
    {
        for(int i = 0; i<this.performance.length; i++)
        {
            if(this.performance[i]<9)return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append(this.surnameNL +
                ": \n group:"+
                this.group +
                "\n balls:");
        for(int i = 0; i<this.performance.length-1; i++)
        {
            str.append(this.performance[i]+", ");
        }
        str.append(this.performance[this.performance.length-1]);
        return str.toString();
    }
}
