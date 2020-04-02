package jc01_2020.buvin.test02;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.List;

public interface Employee {

    String getName();

    void setName(String name);

    Department getDepartment();

    void setDepartment(Department department);

    LocalDate getStartDate();

    void setStartDate(LocalDate startDate);

    LocalDate getEndDate();

    void setEndDate(LocalDate endDate);

    IsoChronology getWorkPeriod();

    void setWorkPeriod(IsoChronology workPeriod);

    List<Reward> getRewards();

    void setRewards(List<Reward> rewards);

    default String print() {
        String str;
        str = getName() + "\n" + Department.getStringDepartment(this)
                + "\n" + getStartDate() + "\n" + getEndDate()
                + "\n" + getRewards() + "\n" + getWorkPeriod();
        return str;
    }

}
