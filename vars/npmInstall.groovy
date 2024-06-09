def call() {
    sh 'npm install'
    sh 'npm audit fix
    sh'npm install svgo@latest'
}
