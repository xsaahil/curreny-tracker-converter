import { MaterialIcons } from "@expo/vector-icons";
import React from "react";
import { StyleSheet, Text, View } from "react-native";

const CurrencyItem = () => {
  return (
    <View style={styles.itemContainer}>
      <MaterialIcons name="currency-bitcoin" size={30} />
      <View style={styles.currencyContainer}>
        <Text style={styles.currencyName}>Curreny Name</Text>
        <Text style={styles.currencyValue}>Currency Value</Text>
      </View>
    </View>
  );
};

export default CurrencyItem;

const styles = StyleSheet.create({
  itemContainer: {
    backgroundColor: "#202025",
    width: "100%",
    height: 60,
    flexDirection: "row",
    alignItems: "center",
    justifyContent: "flex-start",
    borderRadius: 3,
    borderColor: "#474747",
    borderWidth: 0.6,
    marginBottom: 16
  },
  currencyContainer: { flexDirection: "column", marginLeft: 8 },
  icon: {
    height: 50,
    width: 50,
  },
  currencyName: {
    color: "#D9D9D9",
    lineHeight: 18.6,
    fontSize: 12,
  },
  currencyValue: {
    color: "#A7B2C3",
    lineHeight: 15.5,
    fontSize: 10,
  },
});
