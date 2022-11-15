from flask import Flask, jsonify, request
from flask_cors import CORS
from waitress import serve
import datetime
import requests
import re
import json

app = Flask (__name__)
cors = CORS(app)

###############################
########    CONEXIÓN   ########
###############################

def loadFileConfig():
    with open ('config.json') as f:
        data = json.load(f)
    return data

if __name__ == "__main__":
    dataConfig = loadFileConfig()
    print ("Server url-backend running : http://" + dataConfig["url-backend"]+":"+dataConfig["port"])
    serve (app, host= dataConfig["url-backend"], port=dataConfig["port"])

#####################################
#### TEST O PRUEBA DEL SERVICIO #####
#####################################

@app.route("/", methods=['GET'])
def test():
    Json = {}
    Json["Message"]= "Server Running ..."
    return jsonify(Json)

####################################
########   Librerias JWT    ########


from flask_jwt_extended import create_access_token, verify_jwt_in_request
from flask_jwt_extended import get_jwt_identity
from flask_jwt_extended import jwt_required
from flask_jwt_extended import JWTManager

####################################
########   Crear TOKEN    ########

app.config["JWT_SECRET_KEY"] = 'super-secret' #puedes colocar la clave que quieras
jwt = JWTManager(app)

@app.route("/login", methods=['POST'])
def create_token():
    data =request.get_json()