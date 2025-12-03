package com.springscheduler.scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class scheduler_02 {
	
	private static DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy - MM - dd : HH:mm:ss");
	
	@Scheduled(cron = "1 * * * * ?")
	public void runatcron() {
		System.out.println("[Cron] Task executed at: "+LocalDateTime.now().format(fm));
	}
	@Scheduled(fixedRate = 2000)
	public void runatFixedrate() {
		System.out.println("[FixedRate] Task executed at: "+LocalDateTime.now().format(fm));
	}
	@Scheduled(fixedDelay = 5000, initialDelay = 10000)
	public void runatFixeddelay() {
		System.out.println("[FixedDelay] Task executed at: "+LocalDateTime.now().format(fm));
	}

}
