import jenkins.model.Jenkins

// Setting the Number of Executors for the Master on Zero.

println "# Setting Master Executors to Zero"
Jenkins.instance.setNumExecutors(0)
println "# done.."
