package org.quartz;

import org.quartz.impl.jdbcjobstore.FiredTriggerRecord;
import org.quartz.spi.JobFactory;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ExtendedScheduler extends Scheduler {

    List<FiredTriggerRecord> getFiredTriggers(String jobName, String jobGroup)
        throws SchedulerException;
}
