package leetcoding;

import java.util.ArrayList;
import java.util.List;

public class JobSearch {
	
		private class Job{
			String name;
			Float salary;
			Boolean notAPeon;
			Boolean eatShit;
		}

		public static List<Job> findJobs(List<Job> jobs){

			List<Job> jobWorthyJob = new ArrayList<Job>();

			for(Job job : jobs){
				if((job.salary >= 50000 && job.notAPeon == true) || job.salary >= 120000) {
					jobWorthyJob.add(job);
				}
				else{
					System.out.println("fuck");
				}
			}
			if(jobWorthyJob.size() == 0){
				System.out.println("im fucked");
			}
			return jobWorthyJob;
		}
}
