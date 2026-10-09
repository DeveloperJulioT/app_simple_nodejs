job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/DeveloperJulioT/app_simple_nodejs.git', 'master') { node ->
            node / gitConfigName('DeveloperJulioT')
            node / gitConfigEmail('julio.david.1338@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    publishers {
	
    }
}
