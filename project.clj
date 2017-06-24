(defproject clara-wtf "0.1.0-SNAPSHOT"
  :description "Clara Example Rules"
  :url "https://github.com/cerner/clara-examples"
  :license {:name "Apache License Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.cerner/clara-rules "0.15.0"]

                 ; with this commented, facts are not queryable until after fire-rules
                 ; when clara-tools is included as a dependency, facts can be queried after insertion without fire-rules
                 #_[org.toomuchcode/clara-tools "0.1.1"]])
