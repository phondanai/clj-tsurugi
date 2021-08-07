(ns clj-tsurugi.core
  (:require [clj-http.client :as http-client]))

(defn get
  "Retrieve the value of a record"
  [url key]
  (let [resp (http-client/get (str url "/" key))
        {:keys [status headers body]} resp]
    (if (= status 200)
     body
     status)))

(defn set
  "Set the value of a record."
  [url key val]
  (let [resp (http-client/put
              (str url "/" key)
              {:body val})
        {:keys [status headers body]} resp]
    (= status 201)))

(defn del
  "Remove a record"
  [url key]
  (let [resp (http-client/delete
              (str url "/" key))
        {:keys [status headers body]} resp]
    (= status 204)))

(defn client [url]
  (fn [req key & val]
     (cond
       (= :get req) (get url key)
       (= :set req) (set url key (first val))
       (= :del req) (del url key))))
