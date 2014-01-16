(ns scaffold-app.handler
  (:use [compojure.core]
        [ring.adapter.jetty :as ring])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(defn -main []
  (run-jetty (handler/site app-routes) {:port 8080 :join? false}))
