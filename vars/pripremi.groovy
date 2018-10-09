import hudson.plugins.git.GitSCM

def call(String url) {
	git "${url.getText('utf-8')}"
}