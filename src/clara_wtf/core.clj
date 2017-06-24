(ns clara-wtf.core
  (:require [clara.rules :refer :all]))

(defrecord Order [customer-id order-id amount])
(defquery orders-q [] [?orders <- Order])

(comment
  (def session (-> (mk-session)
                   (insert (->Order 1 2 3))))
  (query session orders-q))
