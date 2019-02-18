import jenkins.model.Jenkins

// Disable Jenkins CLI Remote.

println "# Disable Jenkins CLI"
jenkins.model.Jenkins.instance.getDescriptor("jenkins.CLI").get().setEnabled(false)
Jenkins.instance.save()
println "# done.."
