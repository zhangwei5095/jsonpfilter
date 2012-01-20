package web

class HomeController {
    def text = { render "Hello!" }
    def json = { render(contentType:"text/json") { [text:"Hello!"] } }
}
