(defproject scaffold-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lib-noir "0.7.9"]
                 [compojure "1.1.6"]]
  :main scaffold-app.handler
  :min-lein-version "2.0.0"
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler scaffold-app.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
