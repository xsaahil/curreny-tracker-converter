import { StyleSheet, Text, View } from "react-native";
import React from "react";

const CurrencyHeader = () => {
  return (
    <View style={styles.headerContainer}>
      <Text style={styles.headerText}>Currencies</Text>
    </View>
  );
};

export default CurrencyHeader;

const styles = StyleSheet.create({
  headerContainer: {
    borderBottomWidth: 0.5,
    borderColor: '#474747',
    paddingBottom: 10,
    marginBottom: 10
  },
  headerText: {
    color: "#FFFFFF",
    fontSize: 12,
    lineHeight: 15,
    fontWeight: "400",
  },
});
