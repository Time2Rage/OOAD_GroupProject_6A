package tempsys;

public class Company {
            private static int CO_ID = 0;
            private int coID;
            private String companyName;
            private Industry industry;

            // Job counter for jobUID
    private int jobOffered = 0;

            public Company(String name, Industry industry){
                CO_ID++;
                this.coID = CO_ID;
                this.companyName = name;
                this.industry = industry;
            }

            public int getCoID()
            {
                return this.coID;
            }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public Industry getIndustry() {
            return industry;
        }

        public void setIndustry(Industry industry) {
            this.industry = industry;
        }

        public int getJobOffered()
        {
            return this.jobOffered;
        }

        // Jobs
        public void postJob(Job job)
        {
            jobOffered++;
            Job.JOB_LIST.add(job);

        }
}
