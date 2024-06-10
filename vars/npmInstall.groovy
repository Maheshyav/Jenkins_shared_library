def call() {
    sh 'npm install'
    sh 'npm audit fix --force'
    npm install yargs-parser @latest
}
