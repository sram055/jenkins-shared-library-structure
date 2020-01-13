
#def call(Map stageParams) {
 
#    checkout([
#        $class: 'GitSCM',
#        branches: [[name:  stageParams.branch ]],
#        userRemoteConfigs: [[ url: stageParams.url ]]
#    ])
#  }

def call(Map stageParams) {
 
    checkout([
	$class: 'GitSCM',
	 branches: [[name: '*/master']],
	 doGenerateSubmoduleConfigurations: false,
	 extensions: [],
	 submoduleCfg: [],
	 userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/sram055/jenkins-shared-library-structure.git']]])
  }
