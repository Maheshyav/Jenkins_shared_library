def call() {
    sh 'npm install'
    sh 'npm audit fix --force'
    sh'npm install svgo@latest'
    
}
