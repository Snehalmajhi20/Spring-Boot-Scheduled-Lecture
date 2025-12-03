package com.springscheduler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;

//@Component
public class scheduler_01 {
	
	@Scheduled(cron = "1 * * * * ?")
	public void scheduler_cron() {
		System.out.println("I'm the cron scheduler");
	}
	
	@Scheduled(fixedRate = 2000)
	public void scheduler_fixedrate() {
		System.out.println("I'm the Fixed scheduler");
	}
	
	@Scheduled(fixedDelay = 2000, initialDelay = 6000)
	public void scheduler_fixeddelay() {
		System.out.println("I,m the fixed delay scheduler...");
	}

}
