(defproject simple-app "0.1.0-SNAPSHOT"
  :description "A simple app to learn to use Clojure"
  :url "https://www.github.com/piperrap/simple_app"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.10.3"]]
  :profiles {:dev {:dependencies [[ring/ring-devel "1.4.0"]]}}
  :main simple-app.core
  :aot [simple-app.core])
