def call(String command) {
	if (isUnix()) {
		sh command
	} else {
		bat 'call ' command
	}
}