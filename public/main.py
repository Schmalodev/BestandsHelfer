from flask import Flask, render_template

app = Flask(__name__, static_folder="../src/view/static", template_folder="../src/view/templates")

@app.route("/stand", methods=["POST", "GET"])
def show_stand() -> render_template:
    return render_template("stand.html")

app.run(host="0.0.0.0", port=8000)