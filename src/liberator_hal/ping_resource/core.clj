(ns liberator-hal.ping-resource.core
  (:require
    [liberator-mixin.core :as mixin]
    [liberator-mixin.json.core :as json-mixin]
    [liberator-mixin.hypermedia.core :as hypermedia-mixin]
    [liberator-mixin.hal.core :as hal-mixin]))

(defn build-for [dependencies]
  (mixin/build-resource
    (json-mixin/with-json-mixin dependencies)
    (hypermedia-mixin/with-hypermedia-mixin dependencies)
    (hal-mixin/with-hal-mixin dependencies)))
