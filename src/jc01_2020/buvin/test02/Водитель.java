package jc01_2020.buvin.test02;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.List;

public class Водитель implements Employee, Serializable {

    private String name;
    private Department department;
    private LocalDate startDate;
    private LocalDate endDate;
    private IsoChronology workPeriod;
    private List<Reward> rewards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public IsoChronology getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(IsoChronology workPeriod) {
        this.workPeriod = workPeriod;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

}
